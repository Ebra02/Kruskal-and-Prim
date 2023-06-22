/*
 Abdulaziz Kheder Alghamdi 2035244
 Ebrahim Mansour Sharka 2036339
 Mansour Ahmed Aldhahri 2036538
mdhiabaldahri@stu.kau.edu.sa
 */
class Edge {

    int source, destination, wight;

    public Edge(int source, int destination, int wight) {
        this.source = source;
        this.destination = destination;
        this.wight = wight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWight() {
        return wight;
    }

}