package com.zhyl.lyz;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	//���ڹ��캯��������ע��
	/*private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("textEditor���캯��");
		this.spellChecker = spellChecker;
	}
	
	public void spelling() {
		spellChecker.checkSpelling();
	}*/
	
	/*public TextEditor(int age,String name) {
		System.out.println("���䣺"+age+",���֣�"+name);
	}*/
	
	
	//������ֵ����������ע��
	/*private SpellChecker spellChecker;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("textEditor���캯��");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
        return spellChecker;
    }
	
	public void spellCheck() {
        spellChecker.checkSpelling();
    }*/
	
	
	//�Զ�װ�� ByName��ByType
	/*private SpellChecker spellChecker;
	private String name;
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck() {
	    spellChecker.checkSpelling();
	}*/
	
	//���캯���Զ�װ��
	/*private SpellChecker spellChecker;
    private String name;
    public TextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }*/
	
	//Autowiredע��
	//������
    //@Autowired
	private SpellChecker spellChecker;
	
	//���캯����
	@Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    } 
	//������
    //@Autowired
    /*public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }*/
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
	
	
}
