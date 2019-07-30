package entites;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "posts")
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name="user_id")
        private long author;

        @ManyToOne
        @JoinColumn(name = "topic_id")
        private Topic topic;

        @Column
        private String text;

        @Column(name = "date_created")
        @Temporal(TemporalType.DATE)
        private Date dateCreated;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getAuthor() {
            return author;
        }

        public void setAuthor(long author) {
            this.author = author;
        }

        public Topic getTopic() {
            return topic;
        }

        public void setTopic(Topic topic) {
            this.topic = topic;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Post{");
            sb.append("id=").append(id);
            sb.append(", authorId=").append(author);
            sb.append(", text='").append(text).append('\'');
            sb.append(", dateCreated=").append(dateCreated);
            sb.append('}');
            return sb.toString();
        }
    }
