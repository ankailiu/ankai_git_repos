package designpatterns.composite;

public abstract class FolderComponent {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public FolderComponent(){
	}
	
	public FolderComponent(String name){
		this.name = name;
	}
	
	public abstract void addFolderComponent(FolderComponent component);
	
	public abstract void removeFolderComponent(FolderComponent component);
	
	public abstract void display();
	

}
