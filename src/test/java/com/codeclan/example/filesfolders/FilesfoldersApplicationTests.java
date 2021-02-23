package com.codeclan.example.filesfolders;

import com.codeclan.example.filesfolders.models.File;
import com.codeclan.example.filesfolders.models.Folder;
import com.codeclan.example.filesfolders.repositories.FileRepository;
import com.codeclan.example.filesfolders.repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("animals");
		folderRepository.save(folder);

		File file1 = new File("giraffes", ".txt", "big", folder);
		fileRepository.save(file1);
	}
}
