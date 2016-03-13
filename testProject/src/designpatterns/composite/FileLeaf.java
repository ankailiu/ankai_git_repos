package designpatterns.composite;

public class FileLeaf extends FolderComponent {
	
	public FileLeaf(FolderComponent component){
		
	}
	
	public FileLeaf(final String name){
		super(name);
	}

	@Override
	public void addFolderComponent(FolderComponent component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFolderComponent(FolderComponent component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("FileLeaf:" + this.getName());
	}

}
