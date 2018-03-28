package com.zhyl.lyz;

public class TextEditor {
	
	//基于构造函数的依赖注入
	/*private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("textEditor构造函数");
		this.spellChecker = spellChecker;
	}
	
	public void spelling() {
		spellChecker.checkSpelling();
	}*/
	
	/*public TextEditor(int age,String name) {
		System.out.println("年龄："+age+",名字："+name);
	}*/
	
	
	//基于设值函数的依赖注入
	/*private SpellChecker spellChecker;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("textEditor构造函数");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
        return spellChecker;
    }
	
	public void spellCheck() {
        spellChecker.checkSpelling();
    }*/
	
	
	//自动装配 ByName
	private SpellChecker spellChecker;
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
	}
	
	
}
