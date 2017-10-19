<?
  include_once 'Db.php';
  class Query{
    private $data;
    //public function_constructor(){
    //  $this->data = "Product";
    //}

    public function getProducts(){
      $products = array();
      $com = new DbConnect();
      $sql = "SELECT * FROM products";
      $result = mysqli_query($com->getDb(), $sql);
      $rows = mysqli_num_rows($result);
      if($rows > 0){
        while ($row = $result->fetch_assoc()){
          $products[] = $row;
        }
      echo json_encode($products, JSON_PRETTY_PRINT);
      }
    }
  }
?>
