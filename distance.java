public class distance
{	
	double m;
	distance()
	{
		this(1);
    	} 
	distance(double m)
	{
		this.m=m;
	}
	distance(distance obj)
    	{
		m=obj.m;
	}
  	void convert()
	{
		double f=m*3.28;
		int f1=(int)f;
		float f2=(float)f-f1;
		f2*=12;
		System.out.println("The distance :"+f1+" feets and "+f2+" inches");
	}
}
