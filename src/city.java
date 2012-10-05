
public class city {
	String city;
	int x,y,v=0;
public float distance(city target)
	{
	if(this.city==target.city)
	{
		return 100;
	}
	float temp=(float) Math.sqrt(Math.pow(target.x-this.x,2)+Math.pow(target.y-this.y,2));
	return temp;
	}
public void print()
{
	System.out.println(this.city);
}
}

