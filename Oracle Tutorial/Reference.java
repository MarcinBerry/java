public class Reference 
{
	public static class Circle
	{
		public int m_x;
		public int m_y;
		Circle(int x, int y)
		{
			m_x = x;
			m_y = y;
		}
		public int getX()
		{
			return m_x;
		}
		public int getY()
		{
			return m_y;
		}
		public void setX(int x)
		{
			m_x = x;
		}
		public void setY(int y)
		{
			m_y = y;
		}
	}
	static public void moveCircle(Circle circle, int deltaX, int deltaY)
	{
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);
		
		circle = new Circle(0, 0);
	}
	public static int main(String[] args)
	{
		Circle myCircle = new Circle(12, 23);

		moveCircle(myCircle, 23, 56);
		
		myCircle.getX();
		myCircle.getY();
		return 0;
	}

}