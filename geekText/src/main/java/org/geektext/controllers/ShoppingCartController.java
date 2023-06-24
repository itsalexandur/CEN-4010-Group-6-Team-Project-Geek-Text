package org.geektext.controllers;


import org.geektext.model.SavedBook;
import org.geektext.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {


    @Autowired
    ShoppingCartService cartService;




    @PostMapping("/{userID}/cart/addBook/{bookID}")
    public String addBookToCart(@PathVariable("bookID") long bookID, @PathVariable("userID") long userID) {
        // Adds book to user's cart by bookID

        cartService.addToCart(bookID,userID);
        return "[@PostMapping] Book ID: " + bookID + " added to User ID: " + userID + " shopping cart.";

    }


    @GetMapping("/{userID}/cart/books")
    public List<SavedBook> showBooksInCart(@PathVariable("userID") long userID) {
        // Return all books in user's cart

       return cartService.ShowCartItems(userID);

    }

    @GetMapping("/{userID}/cart/subtotal")
    public double Subtotal(@PathVariable("userID") long userID) {
        // Re-calculates and returns subtotal of all books saved in cart

        return cartService.CalcSubtotal(userID);

    }


    @DeleteMapping("/{userID}/cart/removeBook/{bookID}")
    public String RemoveBook(@PathVariable("userID") long userID, @PathVariable("bookID") long bookID) {
        // Remove book from user's cart using bookID

        cartService.removeFromCart(bookID,userID);
        return "[@DeleteMapping] Book ID: " + bookID + " removed from User ID: " + userID + " shopping cart.";
    }



    @DeleteMapping("/{userID}/cart/remove/all")
    public String RemoveAll(@PathVariable("userID") long userID) {
        // Remove all books from user's cart

        cartService.emptyCart(userID);

        return "[@DeleteMapping] - Shopping cart emptied for User ID: " + userID;
    }


}
