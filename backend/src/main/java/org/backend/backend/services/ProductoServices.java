package org.backend.backend.services;
import java.util.ArrayList;
import org.backend.backend.Producto;
import org.springframework.stereotype.Service;
@Service
public class ProductoServices {
	public final ArrayList<Producto> lista = new ArrayList <Producto>();
	
	public ProductoServices() {
		lista.add(new Producto ("Linear Style", 15000,"prod1img1.jpg", "prod1img2.jpg","Crea tu página web con un diseño simple y elegante en tendencia minimalista."
				, "Simple no significa aburrido, este diseño permite dar un toque relevante y contraste a tus productos para que tomen un papel central. La página cuenta con una base color azul y colores pastel para complementar. Permite observar los productos con gran detalle y es ampliamente adaptable a tus necesidades concretas de diseño. Cuenta con fuentes únicas y superposiciones geométricas que dan personalidad a la página y la hacen visualmente atractiva") );
		lista.add(new Producto ("Naturaleza Calma Elements", 13000, "prod2img1.jpg", "prod2img2.jpg","Es una página hermosa y fresca que da espacio a las imágenes."
				, "Ideal para hacer evidente que la empresa confía en sus diseños y productos. Se ajusta muy bien a categorías de belleza, skincare o productos orgánicos, ya que su aspecto cercano a la naturaleza hará sentir al usuario la experiencia completa y diferente que estás buscando. Cuenta con un footer moderno que deja ver toda la información necesaria por medio de sus tres columnas.") );
		lista.add(new Producto ("Landing Word", 19000, "prod3img1.jpg", "prod3img2.jpg", "Tema responsivo, estructurado de forma armoniosa que incluye tonos oscuros."
				, "Su facilidad de navegación ofrece varias funciones útiles para el usuario sin saturar, ni quitar el foco a los productos. Si necesitas un aspecto profesional y vanguardista, esta página es ideal, ya que cuenta con las tendencias actuales de diseño. El sitio organiza el contenido de forma entretenida porque se compone de una combinación entre lo clásico y lo más actual, con colores que marcan acentos interesantes.") );
		lista.add(new Producto ("Simple Store", 10000, "prod4img1.jpg", "prod4img2.jpg","Breve, agradable y directo, esto es lo que representa el estilo de esta página."
				,"el espacio en blanco permite que sus diseños y el texto llamen la atención del lector, esto ayuda a una mejor legibilidad, especialmente en dispositivos móviles, es importante que la parte visual sea sencilla para que las imágenes capturen la atención, permitiendo incluir llamativas fotografías en primer plano. Su coherencia ayuda a los visitantes a navegar fácilmente en el sitio, facilitando la exploración de selecciones.") );
		lista.add(new Producto ("Simplifica la administración", 9000, "servicio2img1.jpg", "servicio2img2.jpg","administra tu negocio de forma eficiente.usuario", "Con una robusta plataforma que te permitirá lograr tus objetivos Imprime y paga rápidamente las etiquetas de envío, directamente desde tu tienda en línea. Haz envíos a precios competitivos a todos los rincones de tu país, con marcas líderes en la industria como Fedex o Estafeta. Control total de tus pagos online. Gestiona todas las transacciones desde un solo lugar, administra tus transacciones comerciales desde un panel sencillo en el que tendrás control total de todos tus pagos. Obtén información y datos precisos monitoreando el rendimiento de tus ventas con análisis detallados de tu tienda online, te detallamos todos tus ingresos, campañas de marketing, bases de clientes y productos más vendidos."));
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
