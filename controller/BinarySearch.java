package com.skyreco.controller;

import java.util.ArrayList;
import com.skyreco.model.skyrecoModel;

/**
 *
 * @author aayush
 */


public class BinarySearch {
    //using binary search for searching
   public static ArrayList<skyrecoModel> Search(ArrayList<skyrecoModel> list, String search, int index) {
       
       //creating 2 arraylist for storing the sorting list and result or searched values
        ArrayList<skyrecoModel> sortingList = MergeSort.Sort(list, index);
        ArrayList<skyrecoModel> result = new ArrayList<>();

        //calling binarySearch method
        binarySearch(sortingList, search.toLowerCase(), index, 0, sortingList.size() - 1, result);

        //printing the values
        for (int i=0; i<result.size(); i++){
            System.out.print(result.get(i).getSerialNumber());
            System.out.print(result.get(i).getModelNumber());
            System.out.print(result.get(i).getName());
            System.out.print(result.get(i).getCompany());
            System.out.print(result.get(i).getCamera());
            System.out.print(result.get(i).getRange());
            System.out.print(result.get(i).getCost());
            System.out.print(result.get(i).getPurpose());
            System.out.println("  ");
        }
        
        //returning the searched values of datatype ArrayList skyrecoModel
        return result;
    }

    private static void binarySearch(ArrayList<skyrecoModel> list, String searchValue, int index, int left, int right, ArrayList<skyrecoModel> result) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            skyrecoModel midModel = list.get(mid);
            
            int comparison = compareIndex(midModel, searchValue, index);
            
            if (comparison == 0){
                result.add(midModel);
                
                //recursion method
                binarySearch(list, searchValue, index, left, mid - 1, result);
                binarySearch(list, searchValue, index, mid + 1, right, result);
            }
            else if (comparison < 0){
                binarySearch(list, searchValue, index, mid + 1, right, result);
            }
            else {
                binarySearch(list, searchValue, index, left, mid - 1, result);
            }
        }
    }
    
    //comparing according to the choosen row from combo box index
    private static int compareIndex(skyrecoModel model, String search, int index) {
        switch (index) {
            case 0:
                return model.getSerialNumber() - Integer.parseInt(search);
            case 1:
                return model.getModelNumber().compareToIgnoreCase(search);
            case 2:
                return model.getName().compareToIgnoreCase(search);
            case 3:
                return model.getCompany().compareToIgnoreCase(search);
            case 4:
                return model.getCamera().compareToIgnoreCase(search);
            case 5:
                return model.getRange()- Integer.parseInt(search);
            case 6:
                return model.getCost()- Integer.parseInt(search);
            case 7:
                return model.getPurpose().compareToIgnoreCase(search);
            default:
                // when index other then these is given
                throw new IllegalArgumentException("Column not found!");
        }
    }
}