package com.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookDao {

    // Add Book
    public void addBook(Book book) {

        String sql =
                "INSERT INTO books(title,author,category,price) VALUES(?,?,?,?)";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getCategory());
            ps.setDouble(4, book.getPrice());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book Added Successfully");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View All Books
    public void viewBooks() {

        String sql = "SELECT * FROM books";

        try {

            Connection con = Dbconnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n====== Book List ======");

            while (rs.next()) {

                System.out.println(
                        "\nID : " + rs.getInt("id") +
                                "\nTitle : " + rs.getString("title") +
                                "\nAuthor : " + rs.getString("author") +
                                "\nCategory : " + rs.getString("category") +
                                "\nPrice : " + rs.getDouble("price")
                );

                System.out.println("----------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search Book
    public void searchBook(int id) {

        String sql = "SELECT * FROM books WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nBook Found");

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Title : " + rs.getString("title"));
                System.out.println("Author : " + rs.getString("author"));
                System.out.println("Category : " + rs.getString("category"));
                System.out.println("Price : " + rs.getDouble("price"));

            } else {

                System.out.println("Book Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Book Price
    public void updateBookPrice(int id, double price) {

        String sql =
                "UPDATE books SET price=? WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setDouble(1, price);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Book Price Updated Successfully");

            } else {

                System.out.println("Book Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Book
    public void deleteBook(int id) {

        String sql =
                "DELETE FROM books WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Book Deleted Successfully");

            } else {

                System.out.println("Book Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
