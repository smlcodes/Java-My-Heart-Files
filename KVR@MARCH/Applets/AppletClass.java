����   2 }  BDemo  java/awt/Frame  java/awt/event/ActionListener b1 Ljava/awt/Button; b2 b3 b4 l Ljava/awt/Label; <init> ()V Code  BUTTON EXAMPLE...
     (Ljava/lang/String;)V
     setSize (II)V  java/awt/Button  NORTH
  	      " SOUTH	  $ 	  & 	EAST/EXIT	  ( 
  * WEST	  ,   . java/awt/Label
 - 0  	  2  
 - 4 5 6 setAlignment (I)V 8 North
  : ; < add )(Ljava/awt/Component;Ljava/lang/Object;)V > South @ East B West
  D ; E *(Ljava/awt/Component;)Ljava/awt/Component;
  G H I addActionListener "(Ljava/awt/event/ActionListener;)V
  K L M 
setVisible (Z)V LineNumberTable LocalVariableTable this LBDemo; actionPerformed (Ljava/awt/event/ActionEvent;)V
 U W V java/awt/event/ActionEvent X Y 	getSource ()Ljava/lang/Object;	 [ ] \ java/lang/System ^ _ out Ljava/io/PrintStream; a java/lang/StringBuilder c U HAVE CLICKED 
 ` 
  f g h getLabel ()Ljava/lang/String;
 ` j k l append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ` n o h toString
 q s r java/io/PrintStream t  println
 - v w  setText ae Ljava/awt/event/ActionEvent; StackMapTable 
SourceFile 
BDemo.java                	      
                         