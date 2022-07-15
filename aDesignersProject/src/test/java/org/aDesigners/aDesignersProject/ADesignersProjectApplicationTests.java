package org.aDesigners.aDesignersProject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aDesigners.aDesignersProject.model.Producto;
import org.aDesigners.aDesignersProject.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class ADesignersProjectApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	//Aquí empiezan las pruebas unitarias para productos
	

	
	@Test
	public void Producto_GET_Id() throws Exception{
		this.mockMvc.perform(get("/api/products/5")).
		andDo(print())
	   .andExpect(status().isOk())
	   .andExpect(content().string(containsString("Simplifica")));	
	}
	
	@Test
	@Disabled
	public void Producto_POST() throws Exception{
		Producto prod = new Producto();
		prod.setNombre("Creative dining");
		prod.setPrecio(12000);
		prod.setCategoria_id(1);
		prod.setImg("prod6img1");
		prod.setImg2("prod6img2");
		prod.setDescripcion("Diseño multifuncional ideal para restaurantes y venta de productos gourmet. ");
		prod.setDescripcion2("Cuenta con un menú de navegación muy intuitivo y una barra de búsqueda avanzada.");
		this.mockMvc.perform(post("/api/products/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(prod)))
		        .andDo(print())
		        .andExpect(status().isOk())
		        .andExpect(content().string(containsString("Creative")));
		
		
	}
	
	
	public static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
 } // asJsonString
	
	@Test
	@Disabled
	public void productoDELETE() throws Exception {
		this.mockMvc.perform( delete("/api/products/9"))
		.andDo( print() )
		.andExpect( status().isOk() )
		  .andExpect( content().string(containsString("Technology light")));
	}// delete DE PRODUCTOS
	
	
	@Test
	@Disabled
	public void productoPUT() throws Exception {
		this.mockMvc.perform(put("/api/products/10").queryParam("nombre", "Techny life"))
		.andDo( print() )
		.andExpect(status().isOk())
		  .andExpect(content().string(containsString("Techny life")));
	}// put DE PRODUCTOS
	
	
	//Aquí empiezan las pruebas unitarias para usuarios
	
	@Test
	public void Usuario_GET_Id() throws Exception {
		this.mockMvc.perform(get("/api/users/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Omar")));
		
	}
	
	@Test
	@Disabled
	public void Usuario_POST() throws Exception{
		User us = new User();
	    us.setNombre("Fernanda Martínez");
	    us.setCorreo("fernanda@gmail.com");
	    us.setTel("5564781235");
	    us.setContrasena("princesita456");
		this.mockMvc.perform(post("/api/users/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonStringUS(us)))
		        .andDo(print())
		        .andExpect(status().isOk())
		        .andExpect(content().string(containsString("Fernanda")));
		
		
	}
	

	public static String asJsonStringUS(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
 }
	
	@Test
	@Disabled
	public void userDELETE() throws Exception {
		this.mockMvc.perform(delete("/api/users/4"))
		.andDo( print() )
		.andExpect(status().isOk())
		  .andExpect(content().string(containsString("Mariana")));
	}// delete DE users

	@Test
	public void userPut() throws Exception {
		this.mockMvc.perform(put("/api/users/3").queryParam("nombre", "Mariana Macias"))
		.andDo( print() )
		.andExpect(status().isOk())
		  .andExpect(content().string(containsString("Mariana Macias")));
	}// put DE users

}
