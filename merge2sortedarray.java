//merge 2 sorted array without using extra space.
static void merge(int vec1[],int vec2[],int m, int n)
{
    int i = 0, j = 0, k = n - 1;
    while (i <= k && j < m) {
        if (vec1[i] < vec2[j])
            i++;
        else {
            int temp = vec2[j];
            vec2[j] = vec1[k];
            vec1[k] = temp;
            j++;
            k--;
        }
    }
    Arrays.sort(vec1);
    Arrays.sort(vec2);
}
