package com.cart.CartHandler.controller;
import com.cart.CartHandler.dto.BooleanPOJO;
import com.cart.CartHandler.dto.CartDTO;
import com.cart.CartHandler.entity.Cart;
import com.cart.CartHandler.entity.CartIdentity;
import com.cart.CartHandler.services.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

   /* @RequestMapping(method = RequestMethod.GET, value = "/getOne/{cartId}/{productId}")
    public ResponseEntity<?> getOne(@PathVariable("cartId") String cartId,@PathVariable("productId") String productId) {
        Cart cart = cartService.findOne(cartId,productId);
        CartDTO cartDTO = new CartDTO();
        if (cart == null) {
            return new ResponseEntity<String>("", HttpStatus.OK);
        }
        BeanUtils.copyProperties(cart, cartDTO);
        return new ResponseEntity<CartDTO>(cartDTO, HttpStatus.OK);

    }*/
   @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getOneByCartId/{cartId}")
    public ResponseEntity<?> getOneByCartId(@PathVariable("cartId") String cartId) {
        List<Cart> cart = cartService.findOneByCartId(cartId);
        List<CartDTO> cartDTOS=new ArrayList<>();
        for(Cart c:cart)
        {
            CartDTO cartDTO = new CartDTO();
            if (cart == null) {
                return new ResponseEntity<String>("", HttpStatus.OK);
            }
            BeanUtils.copyProperties(c, cartDTO);
            cartDTOS.add(cartDTO);
        }

        return new ResponseEntity<List<CartDTO>>(cartDTOS, HttpStatus.OK);

    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/incrementCartByProduct/{cartId}/{prodId}")
    public ResponseEntity<?> incrementCartByProduct(@PathVariable("cartId") String cartId,@PathVariable("prodId") String prodId) {

        BooleanPOJO response=new BooleanPOJO();
        response.setResponse(cartService.incrementQuantity(cartId,prodId));
        return new ResponseEntity<BooleanPOJO>(response, HttpStatus.OK);

    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/decrementCartByProduct/{cartId}/{prodId}")
    public ResponseEntity<?> decrementCartByProduct(@PathVariable("cartId") String cartId,@PathVariable("prodId") String prodId) {

        BooleanPOJO response=new BooleanPOJO();
        response.setResponse(cartService.decrementQuantity(cartId,prodId));
        return new ResponseEntity<BooleanPOJO>(response, HttpStatus.OK);

    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/removeProductFromCart/{cartId}/{prodId}")
    public ResponseEntity<?> removeProductFromCart(@PathVariable("cartId") String cartId,@PathVariable("prodId") String prodId) {

        BooleanPOJO response=new BooleanPOJO();
        response.setResponse(cartService.removeProductFromCart(cartId,prodId));
        return new ResponseEntity<BooleanPOJO>(response, HttpStatus.OK);

    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/addToCart")
    public ResponseEntity<?> addOrUpdateEmployee(@RequestBody CartDTO cartDTO) {
        //System.out.println(employeeDTO);
        Cart cart = new Cart();
       // cart.setCartIdentity(new CartIdentity(cartDTO.getCartIdentity().getCartId(),cartDTO.getCartIdentity().getProductId()));
        //cart.
        BeanUtils.copyProperties(cartDTO, cart);
        //System.out.println(employee);
        BooleanPOJO response=new BooleanPOJO();
        response.setResponse(cartService.addToCart(cart));
        return new ResponseEntity<BooleanPOJO>(response, HttpStatus.CREATED);
    }
}
