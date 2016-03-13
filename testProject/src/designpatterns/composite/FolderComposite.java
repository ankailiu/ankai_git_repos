package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite extends FolderComponent {
	
	private final List<FolderComponent> components;
	
	public FolderComposite(final String name){
		super(name);
		components = new ArrayList<FolderComponent>();
	}
	
	public FolderComposite(){
		components = new ArrayList<FolderComponent>();
	}

	@Override
	public void addFolderComponent(FolderComponent component) {
		this.components.add(component);
	}

	@Override
	public void removeFolderComponent(FolderComponent component) {
		this.components.remove(component);

	}

	@Override
	public void display() {
		System.out.println("FolderComposite---name:" + this.getName());
		for(FolderComponent fc : components){
			System.out.println("FolderComposite---component-name:" + fc.getName());
		}
	}

}
