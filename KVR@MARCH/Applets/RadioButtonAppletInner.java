����   2 �  	LoveClass  java/awt/Frame  java/awt/event/ActionListener l1 Ljava/awt/Label; l2 l3 a Ljava/awt/TextField; b sub Ljava/awt/Button; e <init> ()V Code
      java/awt/FlowLayout
  
     	setLayout (Ljava/awt/LayoutManager;)V  SatyaJohnny's :LOVE HATING
    ! " setTitle (Ljava/lang/String;)V
  $ % & setSize (II)V ( java/awt/Label * 	Your name
 ' ,  - (Ljava/lang/String;I)V	  /   1 java/awt/TextField
 0 3  4 (I)V	  6   8 	Ur X name	  : 	 	  <   > java/awt/Button @ SUBMIT
 = B  "	  D   F OUT	  H   J HATTING	  L 
 
  N O P add *(Ljava/awt/Component;)Ljava/awt/Component; R CENTER
  T O U )(Ljava/awt/Component;Ljava/lang/Object;)V
 = W X Y addActionListener "(Ljava/awt/event/ActionListener;)V
  [ \ ] 
setVisible (Z)V LineNumberTable LocalVariableTable this LLoveClass; fl Ljava/awt/FlowLayout; actionPerformed (Ljava/awt/event/ActionEvent;)V
 g i h java/awt/event/ActionEvent j k 	getSource ()Ljava/lang/Object;
 0 m n o getText ()Ljava/lang/String;
 q s r java/lang/String t u equals (Ljava/lang/Object;)Z w U LOVNG 200%
 ' y z " setText
 | ~ } java/lang/Math  � random ()D � java/lang/StringBuil