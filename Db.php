<?php
include_once 'config.php';
class DbConnect{
    private $conn;
    public function __construct(){
        $this->conn = mysqli_connect(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);
        if (mysqli_connect_errno($this->conn))
        {
            echo "Failed to connect to MySQL: " . mysqli_connect_error();
        }
    }
    public function getDb(){
        return $this->conn;
    }
}
