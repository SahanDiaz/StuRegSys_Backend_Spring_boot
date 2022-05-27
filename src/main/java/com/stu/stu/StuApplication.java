package com.stu.stu;

import com.stu.stu.model.Role;
import com.stu.stu.model.User;
import com.stu.stu.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class StuApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuApplication.class, args);
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"Role_User"));
			userService.saveRole(new Role(null,"Role_Admin"));
			userService.saveRole(new Role(null,"Role_User"));
			userService.saveRole(new Role(null,"Role_User"));

			userService.saveUser(new User(null,"hello1","12341234",true,"1",null,null,9840,"74679",3166045,"Role_User",new ArrayList<>()));
			userService.saveUser(new User(null,"hello2","12351235",false,"2",null,null,9841,"9848651",62163654,"Role_User",new ArrayList<>()));
			userService.saveUser(new User(null,"hello3","12361236",true,"3",null,null,9842,"65194",8748441,"Role_User",new ArrayList<>()));
			userService.saveUser(new User(null,"hello4","12371237",false,"4",null,null,9843,"124845",874487,"Role_User",new ArrayList<>()));

			userService.addRoleToUser("hello1","Role_User");
			userService.addRoleToUser("hello2","Role_Admin");
			userService.addRoleToUser("hello3","Role_User");
			userService.addRoleToUser("hello4","Role_User");
		};
	}

}
