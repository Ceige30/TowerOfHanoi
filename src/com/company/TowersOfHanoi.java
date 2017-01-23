package com.company;

public class TowersOfHanoi{
    public int disks;
    public int[] tower;
    public int counter;

    public TowersOfHanoi(int d){
        disks = d;
        tower = new int[d];
        for(int i = 0; i < tower.length; i++)
        {
            tower[i] = 1;
        }
        counter = 0;
    }
    public void solve(){
        for(int i = 1; i <= disks; i++)
            move(i);
    }
    public void move(int size){
        if(size > 0){
            counter++;
            System.out.print("Turn "+counter + ": Move one disk from tower " + tower[size - 1] + " to tower ");
            tower[size - 1] = (tower[size - 1] + (disks%2 == size%2 ? -1 : 1) + 3) % 3;
            if(tower[size - 1] == 0)
                tower[size - 1] = 3;
            System.out.println(tower[size - 1]);
            for(int i = 1; i < size; i++)
                move(i);
        }
    }
}