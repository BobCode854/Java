package _10_method_and_constructor_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bicycle {

    private String brand;
    private Integer frameSize;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getFrameSize() {
		return frameSize;
	}
	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;
	}
	public Bicycle(String brand, Integer frameSize) {
		super();
		this.brand = brand;
		this.frameSize = frameSize;
	}
	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + ", frameSize=" + frameSize + "]";
	}
	
	
   
}

 class BicycleComparator implements Comparator<Bicycle> {

    @Override
    public int compare(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }

}

public class Reference_To_Instance_method_Particular_Object {
	public static void main(String[] args)
	{
		BicycleComparator bikeFrameSizeComparator = new BicycleComparator();
		List<Bicycle> createBicyclesList = new ArrayList<>();
		createBicyclesList.add(new Bicycle("Hero",5));
		createBicyclesList.add(new Bicycle("Honda",6));
		createBicyclesList.add(new Bicycle("Nexas",15));
		createBicyclesList.add(new Bicycle("Auto",3));
		createBicyclesList.add(new Bicycle("Mercedes",25));
		createBicyclesList.add(new Bicycle("Audi",35));
		
		/** Normal Way*/
		createBicyclesList.stream().sorted((a,b)->bikeFrameSizeComparator.compare(a, b));
		/** With Instance Method Reference */
		createBicyclesList.stream().sorted(bikeFrameSizeComparator::compare);
		
		System.out.println(createBicyclesList);

	}

}
