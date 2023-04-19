public class Circle{
	private int coord_x = 0, coord_y = 0, radius = 0;

	public void Circle(int coord_x, int coord_y, int radius){
		this.coord_x = coord_x;
		this.coord_y = coord_y;
		this.radius = radius;
	}
	
	//уравнение окружности
	public boolean isInside(int x, int y){
		if ((this.coord_x - x)*(this.coord_x - x) + (coord_y - y)*(coord_y - y) <= radius*radius)
			return true;
		else 
			return false;
	}
	
	public void zoom(int factor){
		this.radius *= factor;
		this.coord_x *= factor;
		this.coord_y *= factor;
	}
}
