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

  public void removeMember(Tamagotchi member){
    for (int i = 0; i < this.members.length ; i++){
      if(this.members[i] == member){
        this.members[i] = null;
      }
    }
  }

  public void computeDramaFactor(){
    int total_drama = 0;

    for (int i = 0; i < this.members.length; i++){
      if (this.members[i] != null){
        total_drama += this.members[i].drama_level;
      }
    }
    this.setDramaFactor(total_drama/countMembers());
  }

  public void calculateAffinity(){
    for(int s = 0; s <this.members.length; s++){
      if(this.members[s] instanceof ScratchyTamagotchi){
        for(int w = 0; w <this.members.length; w++){
          if(this.members[w] instanceof WickedlyTamagotchi){
            this.members[w].setDramaLevel(this.members[w].drama_level + 1);
            this.members[s].setDramaLevel(this.members[s].drama_level + 1);
            this.members[w].setHappinessLevel(this.members[w].happiness_level - 1);
            this.members[s].setHappinessLevel(this.members[s].happiness_level - 1);
            System.out.println("total =" + this.members[w].drama_level);
          }
        }
      }
    }
  }

}