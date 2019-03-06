package com.model.entities.toys;

import com.model.entities.toys.type.Material;
import com.model.entities.toys.type.Size;

public class Block extends Toy {


 private Material material;

 public Block(Size size, int price, Material material) {
  super(size, price);
  this.material = material;
 }

 @Override
 public String toString() {
  final StringBuilder sb = new StringBuilder("Block{");
  sb.append("material=").append(material);
  sb.append(", size=").append(size);
  sb.append(", price=").append(price);
  sb.append('}');
  return sb.toString();
 }
}
