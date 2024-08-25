package com.skyreco.controller;

import java.util.ArrayList;
import com.skyreco.model.skyrecoModel;

/**
 *
 * @author aayush
 */

public class MergeSort{

    public static ArrayList<skyrecoModel> Sort(ArrayList<skyrecoModel> list, int index) {
        
        //run the recursion method until this condition is met
        if (list.size() <= 1) {
            return list;
        }
        int middle = list.size() / 2;
    
        //creating two arraylist for having half data 
        ArrayList<skyrecoModel> left = new ArrayList<>(list.subList(0, middle));
        ArrayList<skyrecoModel> right = new ArrayList<>(list.subList(middle, list.size()));

        //recursion 
        left = Sort(left, index);
        right = Sort(right, index);

        //returning the sorted arraylist
        return merge(left, right, index);
    }

    public static ArrayList<skyrecoModel> merge(ArrayList<skyrecoModel> left, ArrayList<skyrecoModel> right, int index) {
        ArrayList<skyrecoModel> result = new ArrayList<>();
        int leftIdx = 0, rightIdx = 0;

        while (leftIdx < left.size() && rightIdx < right.size()) {
            skyrecoModel leftModel = left.get(leftIdx);
            skyrecoModel rightModel = right.get(rightIdx);
            
            int comparison=0;
            //for getting the comparison value according to the index selected and row of the table
            switch (index) {
                case 0:
                    //comparing value for serial number
                    comparison= Integer.compare(leftModel.getSerialNumber(), rightModel.getSerialNumber());
                    break;
                case 1:
                    //comparing value for model number
                    comparison= leftModel.getModelNumber().compareTo(rightModel.getModelNumber());
                    break;
                case 2:
                    //comparing value for name
                    comparison= leftModel.getName().compareTo(rightModel.getName());
                    break;
                case 3:
                    //comparing value for company
                    comparison= leftModel.getCompany().compareTo(rightModel.getCompany());
                    break;
                case 4:
                    //comparing value for camera
                    comparison= leftModel.getCamera().compareTo(rightModel.getCamera());
                    break;
                case 5:
                    //comparing value for range
                    comparison= Integer.compare(leftModel.getRange(), rightModel.getRange());
                    break;
                case 6:
                    //comparing value for cost
                    comparison= Integer.compare(leftModel.getCost(), rightModel.getCost());
                    break;
                case 7:
                    //comparing value for the purpose
                    comparison= leftModel.getPurpose().compareTo(rightModel.getPurpose());
                    break;
            }
            
            //checking which value greater to sort it according to it
            if (comparison < 0) {
                result.add(leftModel);
                leftIdx++;
            } else {
                result.add(rightModel);
                rightIdx++;
            }
        }
        
        // Add remaining elements from left and right sublists
        result.addAll(left.subList(leftIdx, left.size()));
        result.addAll(right.subList(rightIdx, right.size()));
        
        //returning the sorted result arraylist skyrecoModel
        return result;
    }
}