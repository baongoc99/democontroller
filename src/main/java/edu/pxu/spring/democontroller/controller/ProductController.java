package edu.pxu.spring.democontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.pxu.spring.democontroller.model.Product;
import edu.pxu.spring.democontroller.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	public ProductService productService;

	@GetMapping("/products")
	public ModelAndView list() {
		List<Product> products = this.productService.findAll();
		ModelAndView modelAndView = new ModelAndView("product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView showCreateform() {
		ModelAndView modelAndView = new ModelAndView("product/create");
		modelAndView.addObject("product", new Product());
		return modelAndView;
	}

	@PostMapping("/new")
	public ModelAndView createProduct(@ModelAttribute("product") Product product) {
		int randomId = (int) (Math.random() * 1000);
		product.setId(randomId);
		this.productService.save(product);

		ModelAndView modelAndView = new ModelAndView("product/create");
		modelAndView.addObject("product", new Product());
		modelAndView.addObject("mess", "new product wwas created");

		return modelAndView;
	}

	@GetMapping(value = "/view")
	public ModelAndView view(@RequestParam("id") Integer productid) {
		Product product = this.productService.findByid(productid);
		ModelAndView modelAndView = new ModelAndView("product/view");
		modelAndView.addObject("product", product);
		return modelAndView;

	}
}
