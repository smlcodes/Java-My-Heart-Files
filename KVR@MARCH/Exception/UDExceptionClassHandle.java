����   2 l  TextFieldAppletInner  java/applet/Applet t1 Ljava/awt/TextField; t2 t3 l1 Ljava/awt/Label; l2 l3 b1 Ljava/awt/Button; b2 b3 b4 <init> ()V Code
     LineNumberTable LocalVariableTable this LTextFieldAppletInner; init
     setSize (II)V
  ! " # 
setVisible (Z)V % java/awt/FlowLayout
 $ 
  ( ) * 	setLayout (Ljava/awt/LayoutManager;)V , java/awt/TextField
 + .  / (I)V	  1  	  3  	  5   7 java/awt/Label 9 Enter First Value:
 6 ;  < (Ljava/lang/String;)V	  > 	 
 @ Enter Second Value:	  B  
 D RESULT:	  F  
 H java/awt/Button J SUM
 G ;	  M   O SUB	  Q   S MUL	  U  
  W X Y add *(Ljava/awt/Component;)Ljava/awt/Component; f Ljava/awt/FlowLayout; start ^  TextFieldAppletInner$InnerApplet
 ] `  a (LTextFieldAppletInner;)V
 G c d e addActionListener "(L