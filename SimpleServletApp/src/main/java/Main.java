import dao.TopicDao;
import dao.UserDao;
import entites.Post;
import entites.Topic;
import entites.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        UserDao userDao = new UserDao();
        TopicDao topicDao = new TopicDao();

        for (int i = 1; i <=5; i++)
        {
            User user = new User();
            user.setLogin("user-" + i);
            user.setPassword("password-" + i);
            user.setRegistrationDate(new Date());

            userDao.save(user);
        }

        for (int i = 1; i <=5; i++)
        {
            Topic topic = new Topic();
            topic.setAuthor(userDao.getById(i));
            topic.setDateCreated(new Date());
            topic.setTitle("Topic-" + i);

            List<Post> posts = new ArrayList<>();
            for (int j = 1; j <= 10; j++)
            {
                final Post post = new Post();
                post.setAuthor(j);
                post.setTopic(topic);
                post.setDateCreated(new Date());
                post.setText("post " + j + " text ... la-la-la");
                posts.add(post);
            }

            topic.setPosts(posts);

            topicDao.save(topic);
        }

        topicDao.loadAll().forEach(System.out::println);
    }
}