def counting_sort(arr: list[float]) -> list[float]:
    """
    Parameters
    -------
    arr : list[float]
        Input list with non-negative numbers.    
    Returns
    -------
    New list containing all numbers from the list in ascending order."""
    c = [0]*(max(arr) + 1)
    for val in arr:
        c[val] += 1

    return [num for num, count in enumerate(c) for _ in range(count)] 

  
def main():
    arr = [75, 11, 32, 84, 92, 7]
    sorted_arr = counting_sort(arr)
    print(sorted_arr)


if __name__ == "__main__":
    main()