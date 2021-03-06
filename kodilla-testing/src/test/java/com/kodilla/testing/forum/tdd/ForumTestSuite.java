package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test suite  for classes of Forum
public class ForumTestSuite {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTests() {
        testCounter++;
        System.out.println("Preparing to execute tests #" + testCounter);
    }

    //Test1
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here");
        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }

    //Test2
    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank yoy for all good words!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    //Test3
    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrivedPost);
    }

    //Test4
    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrivedSomment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrivedSomment);
    }

    //Test5
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    //Test6
    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }

    //Test7
    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());
    }

    //Test8
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuantity());
    }
}














