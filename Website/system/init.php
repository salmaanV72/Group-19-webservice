<?php
  $db = mysqli_connect('127.0.0.1','root','','WeSellDB');
  if (mysqli_connect_errno()) {
    echo 'Failed to connect to database: '. mysqli_connect_error();
    die();
  }
?>
