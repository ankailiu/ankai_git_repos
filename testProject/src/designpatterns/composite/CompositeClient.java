package designpatterns.composite;

public class CompositeClient {

	public static void main(String[] args) {
		FolderComponent leaf = new FileLeaf("runnable file");
		leaf.display();
		
		FolderComponent composite = new FolderComposite("new folder");
		FileLeaf file1 = new FileLeaf("file1 in new folder");
		FileLeaf file2 = new FileLeaf("file2 in new folder");
		composite.addFolderComponent(file1);
		composite.addFolderComponent(file2);
		composite.display();
	}

}
