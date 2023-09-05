from math import floor

def bucket_sort(arr: list[float], k: int) -> list:
    """
    Parameters
    -------
    arr : list[float]
        Input list with non-negative numbers.
    k : float
        The number of buckets to use.
    
    Returns
    -------
    New list containing all numbers from the list in ascending order.
    """
    buckets = [[] for _ in range(k)]
    max_number = 1 + max(arr)
    for i in range(len(arr)):
        buckets[floor(k*arr[i]/max_number)].append(arr[i])
    for i in range(k):
        buckets[i] = sorted(buckets[i])

    return [item for subarr in buckets for item in subarr]


def main():
    arr = [67, 57, 15, 2, 33, 64, 79, 22, 28, 59]
    sorted_arr = bucket_sort(arr, 5)
   
    
if __name__ == "__main__":
    main()