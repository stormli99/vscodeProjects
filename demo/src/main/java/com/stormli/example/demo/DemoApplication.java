package com.stormli.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");

		system.out.println("Hello World!");
	}

/**
 * 测试主函数
 * 该函数没有参数，也没有返回值。
 * 主要功能是输出一句"Hello World!"到控制台。
 */
public void testMain()
{
	System.out.println("Hello World!"); // 输出欢迎信息
}

private void setUpStreams() {
	System.setIn(new ByteArrayInputStream("1".getBytes()));
}

private void restoreStreams() {
	System.setIn(System.in);
}

}
