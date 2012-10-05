
import javax.swing.JFrame;

public class hillclimbing {
	public static int[] swap(int h,int k,int[] i)
	{
		int x;
		x=i[h];
		i[h]=i[k];
		i[k]=x;
		return i;
	}
public static void main(String args[])
{	
	float temp=100,old=100,t2;
	int m=5,z=0;
	int[] i=new int[m+1];	
	    i[0]=0;
		i[1]=1;
		i[2]=2;
		i[3]=3;
		i[4]=4;
		int[] h=new int[m+1];	
		
	//
	JFrame f=new JFrame("The Results for Hill climbing");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JFrame a=new JFrame("The Results for A*");
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	graphi p =new graphi();
	graphi q =new graphi();

	
boolean exe=true;
	
	String cities[]={"A","B","C","D","E"};
	
city c[]=new city[10];
c[0]=new city();
c[0].city=cities[0];c[0].x=5;c[0].y=7;
p.x[0]=c[0].x*50;p.y[0]=c[0].y*50;p.cname[0]=c[0].city;
c[1]=new city();
c[1].city=cities[1];c[1].x=1;c[1].y=7;p.cname[1]=c[1].city;
p.x[1]=c[1].x*50;p.y[1]=c[1].y*50;
c[2]=new city();
c[2].city=cities[2];c[2].x=5;c[2].y=2;p.cname[2]=c[2].city;
p.x[2]=c[2].x*50;p.y[2]=c[2].y*50;
c[3]=new city();
c[3].city=cities[3];c[3].x=1;c[3].y=2;p.cname[3]=c[3].city;
p.x[3]=c[3].x*50;p.y[3]=c[3].y*50;
c[4]=new city();
c[4].city=cities[4];c[4].x=3;c[4].y=4;p.cname[4]=c[4].city;
p.x[4]=c[4].x*50;p.y[4]=c[4].y*50;
p.i1=m;
p.linx=m;
//Greedy Test
q.x[0]=c[0].x*50;q.y[0]=c[0].y*50;q.cname[0]=c[0].city;
q.x[1]=c[1].x*50;q.y[1]=c[1].y*50;q.cname[1]=c[1].city;
q.x[2]=c[2].x*50;q.y[2]=c[2].y*50;q.cname[2]=c[2].city;
q.x[3]=c[3].x*50;q.y[3]=c[3].y*50;q.cname[3]=c[3].city;
q.x[4]=c[4].x*50;q.y[4]=c[4].y*50;q.cname[4]=c[4].city;
q.i1=m;
q.linx=m;
city initial=c[0];
city current=initial;
float total=0;
int j=0;

//
	////hill climbing
while(exe)
{
	for(int y=0;y<=m;y++)
	{
		z=y+1;	
		if(y+1>=m)
		{
			z=0;
		}
		if(c[i[0]] .distance(c[i[1]])+c[i[1]].distance(c[i[2]])+c[i[2]].distance(c[i[3]])+c[i[3]].distance(c[i[4]])+c[i[4]].distance(c[i[0]])<temp)
		{
			temp=c[i[0]] .distance(c[i[1]])+c[i[1]].distance(c[i[2]])+c[i[2]].distance(c[i[3]])+c[i[3]].distance(c[i[4]])+c[i[4]].distance(c[i[0]]);
			
			for(int s=0;s<m;s++)
			{
				h[s]=i[s];
			}
		
		}
		
		
		if(y!=0)
			i=swap(y-1,y,i);
		
		i=swap(y,z,i);
	}
	if(temp<old)
	{
		old=temp;
	}
	else
	{
		exe=false;
	}
		
	for(int s=0;s<m;s++)
	{
		i[s]=h[s];
	}
}
///

		for(int o=0;o<4;o++)
	{
		p.linx1[o]=c[h[o]].x*50;
		p.linx2[o]=c[h[o]].y*50;
		p.linx3[o]=c[h[o+1]].x*50;
		p.linx4[o]=c[h[o+1]].y*50;
	}
		p.linx1[m-1]=c[h[m-1]].x*50;
		p.linx2[m-1]=c[h[m-1]].y*50;
		p.linx3[m-1]=c[h[0]].x*50;
		p.linx4[m-1]=c[h[0]].y*50;
		p.total="Starting city="+c[h[0]].city+"   Total Distance="+String.valueOf(temp);
	
//----End of hill climbing
		
		//===A* beginning

		while(j<m-1)
		{
		initial.v=1;

		//initial.print();
			 temp=100;
			city news=initial;
			for(int i1=0;i1<5;i1++)
			{
				if(initial.distance(c[i1])<temp&&c[i1].v==0)
				{
				temp=initial.distance(c[i1]);
					news=c[i1];
				//	System.out.println(initial.city+" "+c[i1].city+" "+temp);
					
				}
				
			}
			q.linx1[j]=initial.x*50;
			q.linx2[j]=initial.y*50;
			q.linx3[j]=news.x*50;
			q.linx4[j]=news.y*50;
			total=total+temp;
			
			initial=news;
			j++;
		}
		//current.print();
		total=total+current.distance(initial);
		q.linx1[j]=current.x*50;
		q.linx2[j]=current.y*50;
		q.linx3[j]=initial.x*50;
		q.linx4[j]=initial.y*50;
		q.linx=++j;
		//System.out.println(total);
		q.total="Source="+current.city+"   Path Cost="+String.valueOf(total);
		/*f.add(q);

		f.setSize(600,600);
		f.setVisible(true);
		*/
		//====A* End
	
		


f.add(p);
a.add(q);
a.setSize(600,600);
a.setVisible(true);
f.setSize(600,600);
f.setVisible(true);

}

}
