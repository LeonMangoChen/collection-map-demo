package com.leon.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	/**
	 * �ð����װѧ�����͵Ķ���
	 */
	public Map<String,Student> students;
	
	/**
	 * �ڹ������г�ʼ��students����
	 */
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	
	/**
	 * �������ӣ�����ѧ��ID���ж��Ƿ�ռ��
	 * ��δ��ռ�ã�������������������ѧ������
	 * �������ӵ�students��
	 */
	public void testPut(){
		//����һ��Scanner����������ȡ�����ѧ��ID������
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("������ѧ��ID��");
			String ID = console.next();
			//�жϸ�ID�Ƿ�ռ��
			Student st = students.get(ID);
			if(st == null){
				//��ʾ����ѧ������
				System.out.println("������ѧ��������");
				String name = console.next();
				//�����µ�ѧ������
				Student newStudent = new Student(ID,name);
				//ͨ������students��put����������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ�����ѧ����" + students.get(ID).getName());
				i++;
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}
	}
	
	/**
	 * ����Map��keySet����
	 */
	public void testKeySet(){
		//ͨ��keySet����������Map�е����С�������set����
		Set<String> keySet = students.keySet();
		//ȡ��students������
		System.out.println("�ܹ��У�" + students.size() + "��ѧ����" );
		//����keySet��ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��value
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if(st != null){
				System.out.println("ѧ����" + st.getName());
			}
		}
	}

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
	}

}