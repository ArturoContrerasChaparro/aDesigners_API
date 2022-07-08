package org.backend.backend.services;
import java.util.ArrayList;
import org.backend.backend.Producto;
import org.springframework.stereotype.Service;
@Service
public class ProductoServices {
	public final ArrayList<Producto> lista = new ArrayList <Producto>();
	
	public ProductoServices() {
		lista.add(new Producto ("Linear Style", 15000,"prod1img1.jpg", "prod1img2.jpg","Crea tu p�gina web con un dise�o simple y elegante en tendencia minimalista."
				, "Simple no significa aburrido, este dise�o permite dar un toque relevante y contraste a tus productos para que tomen un papel central. La p�gina cuenta con una base color azul y colores pastel para complementar. Permite observar los productos con gran detalle y es ampliamente adaptable a tus necesidades concretas de dise�o. Cuenta con fuentes �nicas y superposiciones geom�tricas que dan personalidad a la p�gina y la hacen visualmente atractiva") );
		lista.add(new Producto ("Naturaleza Calma Elements", 13000, "prod2img1.jpg", "prod2img2.jpg","Es una p�gina hermosa y fresca que da espacio a las im�genes."
				, "Ideal para hacer evidente que la empresa conf�a en sus dise�os y productos. Se ajusta muy bien a categor�as de belleza, skincare o productos org�nicos, ya que su aspecto cercano a la naturaleza har� sentir al usuario la experiencia completa y diferente que est�s buscando. Cuenta con un footer moderno que deja ver toda la informaci�n necesaria por medio de sus tres columnas.") );
		lista.add(new Producto ("Landing Word", 19000, "prod3img1.jpg", "prod3img2.jpg", "Tema responsivo, estructurado de forma armoniosa que incluye tonos oscuros."
				, "Su facilidad de navegaci�n ofrece varias funciones �tiles para el usuario sin saturar, ni quitar el foco a los productos. Si necesitas un aspecto profesional y vanguardista, esta p�gina es ideal, ya que cuenta con las tendencias actuales de dise�o. El sitio organiza el contenido de forma entretenida porque se compone de una combinaci�n entre lo cl�sico y lo m�s actual, con colores que marcan acentos interesantes.") );
		lista.add(new Producto ("Simple Store", 10000, "prod4img1.jpg", "prod4img2.jpg","Breve, agradable y directo, esto es lo que representa el estilo de esta p�gina."
				,"el espacio en blanco permite que sus dise�os y el texto llamen la atenci�n del lector, esto ayuda a una mejor legibilidad, especialmente en dispositivos m�viles, es importante que la parte visual sea sencilla para que las im�genes capturen la atenci�n, permitiendo incluir llamativas fotograf�as en primer plano. Su coherencia ayuda a los visitantes a navegar f�cilmente en el sitio, facilitando la exploraci�n de selecciones.") );
		lista.add(new Producto ("Simplifica la administraci�n", 9000, "servicio2img1.jpg", "servicio2img2.jpg","administra tu negocio de forma eficiente.usuario", "Con una robusta plataforma que te permitir� lograr tus objetivos Imprime y paga r�pidamente las etiquetas de env�o, directamente desde tu tienda en l�nea. Haz env�os a precios competitivos a todos los rincones de tu pa�s, con marcas l�deres en la industria como Fedex o Estafeta. Control total de tus pagos online. Gestiona todas las transacciones desde un solo lugar, administra tus transacciones comerciales desde un panel sencillo en el que tendr�s control total de todos tus pagos. Obt�n informaci�n y datos precisos monitoreando el rendimiento de tus ventas con an�lisis detallados de tu tienda online, te detallamos todos tus ingresos, campa�as de marketing, bases de clientes y productos m�s vendidos."));
	}// constructor
	
	public ArrayList<Producto> getProductos(){
		return lista;
	}
	public Producto getProducto(Long id) {
	Producto tmpProd = null;
		for (Producto producto : lista) {
		if(producto.getId()==id) {
			tmpProd= producto;
			break;
		}//if
	}//foreach
		return tmpProd;
	}// getProducto

	public Producto deleteProducto(Long id) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
		if(producto.getId()==id) {
			tmpProd= lista.remove(lista.indexOf(producto));
			break;
		}//if
	}//foreach
		return tmpProd;
	}// deleteProducto

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	}//addProducto

	public Producto updateProduct(Long id, 
			String nombre, Double precio, String imagen, String imgagenTwo, String descripcion,
			String descripcion2) {
		
		Producto tmpProd= null;
		for (Producto producto : lista) {
			if(producto.getId()==id) {
				if(nombre!=null) tmpProd.setNombre(nombre);
				if(precio!=null) tmpProd.setPrecio(precio.doubleValue());
				if(imagen!=null) tmpProd.setImagen(imagen);
				if(imgagenTwo!=null) tmpProd.setImgagenTwo(imgagenTwo);
				if(descripcion!=null) tmpProd.setDescripcion(descripcion);
				if(descripcion2!=null) tmpProd.setDescripcion2(descripcion2);
				
				
				
				tmpProd=producto;
				break;
			}//if
		}//foreach
		return tmpProd;
	}// updateProducto
}// c;ass ProductoServices
