package wizard_management;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.*;


public class House{

  String name;
  Boolean contract;
  int drama_factor;
  Tamagotchi[] members;
  HashMap<Tamagotchi, Integer> voteHashMap;

  public House(String name, boolean contract, int drama_factor){
    this.name = name;
    this.contract = contract;
    this.drama_factor = drama_factor;
    this.members = new Tamagotchi[10];
    this.voteHashMap = new HashMap<Tamagotchi, Integer>();
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
    this.drama_factor = this.drama_factor < 0 ? 0 : this.drama_factor;
    this.drama_factor = this.drama_factor > 10 ? 10 : this.drama_factor;
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

  public Tamagotchi findMember(Tamagotchi member){
    for (int i = 0; i < this.members.length ; i++){
      if(this.members[i] == member){
        return this.members[i];
      }
    }
    return null;
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
        for(int i = 0; i <this.members.length; i++){
          if(this.members[i] instanceof ItchyTamagotchi){
            this.members[i].setDramaLevel(this.members[i].drama_level - 1);
            this.members[s].setDramaLevel(this.members[s].drama_level - 1);
            this.members[i].setHappinessLevel(this.members[i].happiness_level + 1);
            this.members[s].setHappinessLevel(this.members[s].happiness_level + 1);
          }
        }
      }
    }
  }

  public void calculateNegativeAffinity(){
    for(int s = 0; s <this.members.length; s++){
      if(this.members[s] instanceof ScratchyTamagotchi){
        for(int w = 0; w <this.members.length; w++){
          if(this.members[w] instanceof WickedlyTamagotchi){
            this.members[w].setDramaLevel(this.members[w].drama_level + 1);
            this.members[s].setDramaLevel(this.members[s].drama_level + 1);
            this.members[w].setHappinessLevel(this.members[w].happiness_level - 1);
            this.members[s].setHappinessLevel(this.members[s].happiness_level - 1);
          }
        }
      }
    }
  }

  public ArrayList<Tamagotchi> getDramaOfOver5(){
    ArrayList<Tamagotchi> drama_over_5 = new ArrayList<Tamagotchi>();

    for(int i = 0; i < this.members.length ; i++){
      if(this.members[i] != null && this.members[i].getDramaLevel() > 5){
        drama_over_5.add(this.members[i]);
      }
    }
    return drama_over_5;
  }

  public void setScoreCard(){
    ArrayList<Tamagotchi> tamagotchis_over_5 = this.getDramaOfOver5();
    for(int i = 0; i < tamagotchis_over_5.size() ; i++){
        this.voteHashMap.put(tamagotchis_over_5.get(i), 0);
    }
  }

  public void addVoteToCard(Tamagotchi tamagotchi, int vote_count){
    for(Entry<Tamagotchi, Integer> voter : voteHashMap.entrySet()){
      if(voter.getKey() == tamagotchi){
        voter.setValue(vote_count);
      }
    }
  }

  public Tamagotchi calculateMostVotes(){
    int maxVoteValue = (int) (Collections.max(this.voteHashMap.values()));
      for(Entry<Tamagotchi, Integer> entry : this.voteHashMap.entrySet()){
        if(entry.getValue() == maxVoteValue){
          return entry.getKey();
        }
      }
      return null;
  }

  public void eject(){
    Tamagotchi ejected_member = this.calculateMostVotes();
    this.removeMember(ejected_member);
  }

}