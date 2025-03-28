// Java program for Merge Sort

//Parallelizable: Merge sort is a naturally parallelizable algorithm, which means it can be
// easily parallelized to take advantage of multiple processors or threads.

class MergeSort {
    // Merges two subarrays of a[]
    void merge(int a[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { //if [0] < [0]
                a[k] = L[i];
                System.out.println("Swapping"+ L[i] + " with " + R[j]);
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts a[l..r] using
    // merge()
    void sort(int a[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2; //getting the middle
            // Sort first and second halves RECURSIVELY
            System.out.println("calling Left and mid with values of:  "+ l + " " + m);
            sort(a, l, m);
            System.out.println("calling Right and mid with values of:  "+ m + "+1 " + r);
            sort(a, m + 1, r);

            // Merge the sorted halves
            System.out.printf("Merging:%d%d%d\n",l,m,r);
            merge(a, l, m, r);
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int SIZE = 300;
        int array1[] = new int[SIZE];

        //fill Array
        for(int i = 0; i < SIZE; i++)
            array1[i] = i;

        // Calling of Merge Sort
        MergeSort myObj = new MergeSort();
        myObj.sort(array1, 0, array1.length - 1);

        for (int i = 0; i < SIZE; ++i)
            System.out.print(array1[i] + " ");
    }
}
