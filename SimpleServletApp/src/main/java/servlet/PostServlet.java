package servlet;

import dao.TopicDao;
import entites.Post;
import entites.Topic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet
{
    @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String tid = req.getParameter("tid");
        final long topicId = Long.parseLong(tid);
        final Topic topic = new TopicDao().getById(topicId);

        final PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.printf("<title>All post to topic \"%s\" : </title>\n", topic.getTitle());
        writer.println("</head>");

        writer.println("<body>");

        writer.println("<h1>" + topic.getTitle() + "</h1>");

        for (Post p : topic.getPosts())
        {
            writer.printf("<p>%d : %s</p>\n", p.getId(), p.getText());
        }

        writer.println("<body>");
        writer.println("</html>");
    }
}