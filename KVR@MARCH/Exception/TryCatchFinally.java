����   2 r  TextAreaAppletThis  java/applet/Applet  java/awt/event/TextListener l1 Ljava/awt/Label; l2 t1 Ljava/awt/TextField; ta Ljava/awt/TextArea; <init> ()V Code
     LineNumberTable LocalVariableTable this LTextAreaAppletThis; init
     setSize (II)V
     
setVisible (Z)V ! java/awt/FlowLayout
   
  $ % & 	setLayout (Ljava/awt/LayoutManager;)V ( java/awt/Label * Enter Line of Text:
 ' ,  - (Ljava/lang/String;)V	  /   1 Ur Text:	  3 	  5 java/awt/TextField
 4 7  8 (I)V	  : 
  < java/awt/TextArea
 ; >  	  @  
  B C D add *(Ljava/awt/Component;)Ljava/awt/Component; f Ljava/awt/FlowLayout; start I TextAreaApplet
 H 
 4 L M N addTextListener  (Ljava/awt/event/TextListener;)V apl LTextAreaApplet; textValueChanged (Ljava/awt/event/TextEvent;)V
 4 T U V getText ()Ljava/lang/String; X java/lang/