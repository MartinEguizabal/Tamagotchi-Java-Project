package wizard_management;

public class House{

  String name;
  Boolean contract;
  int drama_factor;
  Tamagotchi[] members;

  public House(String name, boolean contract, int drama_factor){
    this.name = name;
    this.contract = contract;
    this.drama_factor = drama_factor;
    this.members = new Tamagotchi[10];
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public boolean getContract(){
    return this.contract;
  }

  public void setContract(boolean contract){
    this.contract = contract;
  }

  public int getDramaFactor(){
    return this.drama_factor;
  }

  public void setDramaFactor(int drama_factor){
    this.drama_factor = drama_factor;
    if (this.drama_factor < 0){
      this.drama_factor = 0;
    }
    if(this.drama_factor > 10){
      this.drama_factor = 10;
    }
  }

  public int countMembers(){
    int count = 0;
    for(Tamagotchi member : this.members){
      if(member != null){
        count ++;
      } 
    }
    return count;
  }

  public void addMember(Tamagotchi member){
    if(isFull()){
      return;
    }
    int index = this.countMembers();
    members[index] = member;
  }

  public boolean isFull(){
    return this.countMembers() == this.members.length;
  }


}