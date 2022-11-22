# Data-Structures-and-Algorithm-with-Java-NQH
1. Sort                                                                                                                                                                 
1.1 Bubble Sort                                                                                                                                                         
 Bắt đầu từ vị trí số 1, xét lần lượt từng cặp 2 phần tử, nếu phần tử bên phải nhỏ hơn phần tử bên trái, ta sẽ thực hiện đổi chỗ 2 phần tử này, nếu không, xét tiếp cặp tiếp theo. Với cách làm như vậy, phần tử nhỏ hơn sẽ "nổi" lên, còn phần tử lớn hơn sẽ "chìm" dần và về bên phải.
 Khi kết thúc vòng thứ nhất, ta sẽ đưa được phần tử lớn nhất về cuối dãy. Sang vòng thứ hai, ta tiếp tục bắt đầu ở vị trí đầu tiên như vậy và đưa được phần tử lớn thứ hai về vị trí thứ hai ở cuối dãy ...
 Độ phức tạp : O(n^2)
 * Hiệu suất chậm nhất trong các thuật toán sắp xếp.
 * Không hiệu quả với những dữ liệu lớn.                                                                                                                               
 1.2 Quick Sort                                                                                                                                                         
 Thuật toán Quick Sort chia mảng thành hai phần bằng cách so sánh từng phần tử của mảng với một phần tử được gọi là phần tử chốt. Một mảng bao gồm các phần tử nhỏ hơn hoặc bằng phần tử chốt và một mảng gồm các phần tử lớn hơn phần tử chốt.
 Quá trình phân chia này diễn ra cho đến khi độ dài của các mảng con đều bằng 1. Với phương pháp đệ quy ta có thể sắp xếp nhanh các mảng con sau khi kết thúc chương trình ta được một mảng đã sắp xếp hoàn chỉnh.
 Ở bài tập này chọn phần tử đứng đầu làm phần tử chốt.
 Độ phức tạp thuật toán : O(nlogn)    
 1.3 Selection Sort                                                                                                                                                     
 Thuật toán Selection Sort sắp xếp một mảng bằng cách liên tục tìm phần tử nhỏ nhất (xét theo thứ tự tăng dần) từ phần chưa được sắp xếp và đặt nó ở đầu. Thuật toán duy trì hai mảng con trong một mảng nhất định.
 + Mảng con đã được sắp xếp.
 + Mảng con còn lại chưa được sắp xếp.
 Trong mỗi lần lặp lại sắp xếp lựa chọn, phần tử tối thiểu (xét theo thứ tự tăng dần) từ mảng con chưa được sắp xếp sẽ được chọn và chuyển đến mảng con đã sắp xếp.
 Độ phức tạp thuật toán : O(n^2)                                                                                                                                       
 1.4 Merge Sort                                                                                                                                                         
 Giả sử có hai danh sách đã được sắp xếp a[1 ... m] và b[1 ... n].
 Ta có thể trộn chúng lại thành một danh sách mới c[1 ... m+n] được sắp xếp theo cách sau:
 So sánh hai phần tử đứng đầu của hai danh sách, lấy phần tử nhỏ hơn cho vào danh sách mới. Tiếp tục như vậy cho tới khi một trong hai danh sách là rỗng.
 Khi một trong hai danh sách là rỗng ta lấy phần còn lại của danh sách kia cho vào cuối danh sách mới.
 Độ phức tạp thuật toán: O(nlog(n))                                                                                                                                     
 1.5 Insertion Sort                                                                                                                                                     
  + Lặp lại từ arr[1] đến arr[n] trên mảng.
  + So sánh phần tử hiện tại (khóa) với phần tử trước của nó.
  + Nếu phần tử chính nhỏ hơn phần tử trước của nó, hãy so sánh nó với các phần tử trước đó. Di chuyển các phần tử lớn hơn lên một vị trí để tạo khoảng trống cho phần tử được hoán đổi.
