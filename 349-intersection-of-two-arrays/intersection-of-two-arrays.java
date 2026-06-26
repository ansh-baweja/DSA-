


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Sort both arrays
        insertion(nums1);
        insertion(nums2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

                // Add only if not already added
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }

                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;

            } else {
                j++;
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }

    static void insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
    }
}
   