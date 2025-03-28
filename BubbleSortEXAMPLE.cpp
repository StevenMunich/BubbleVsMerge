// HouseholdSize.cpp - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size. 
// Input:  Interactive.
// Output:  Mean and median household size. 

#include <iostream>
#include <string>
using namespace std;

int main() 
{
   // Declare variables.
	bool didswap = true	;
   const int SIZE = 300;	// Number of household sizes
   int householdSizes[SIZE];   	// Array used to store 300 household sizes
   int x; 
   int limit = SIZE;
   int householdSize = 0;
   int pairsToCompare;
   bool switchOccurred; 
   int temp;
   double sum = 0;
   double mean = 0;
   double median = 0;
   
	for(x=0; x < SIZE; x++)      
      householdSizes[x] = x; //reverse order for sorting. to make it backwards do SIZE - x
     // End of input loop.
     
	pairsToCompare = x;		
   
   // Find the mean
   sum = householdSizes[0];
   for (x=1; x < pairsToCompare; x++ ){
       sum += householdSizes[x];       
   } 
   
    
   // This is the work done in the sortArray() function
while (didswap == true){
    
    didswap = false;
       for (x=0; x < pairsToCompare; x++ ){
        
        if (householdSizes[x] < householdSizes[x + 1] ){
            temp = householdSizes[x + 1];
            cout << "Swapping " << householdSizes[x + 1] << " with " << householdSizes[x] << endl;
                householdSizes[x + 1] = householdSizes[x];
                householdSizes[x] = temp;
            didswap = true;
        }//end if
        
    }//end for
    
}//end while
    
   // This is the work done in the displayArray() function
 for (x=0; x < pairsToCompare; x++ ){
     cout << householdSizes[x] << endl;
 }
   // Print the mean
//cout << mean << endl;
mean = sum / pairsToCompare;
    cout << mean << " 3";
   // Find the median
 
   // Print the median
   // 	cout << median << endl;	
   return 0;
} // End of main function





