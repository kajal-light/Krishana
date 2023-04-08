package com.company.loops;

public enum Efficiency {

  BASIC,EFFICIENT,MORE_EFFICIENT;

  public static boolean isBasic(String s){
      if(s.equals(BASIC.name())){
          return true;

      }
      return false;
  }

    public  static boolean isEfficient(String s){
        if(s.equals(EFFICIENT.name())){
            return true;

        }
        return false;
    }
    public  static boolean isMoreEfficient(String s){
        if(s.equals(MORE_EFFICIENT.name())){
            return true;

        }
        return false;
    }

}
