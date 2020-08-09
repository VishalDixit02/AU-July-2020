import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrls: ['./view-product.component.scss']
})
export class ViewProductComponent implements OnInit {

  viewComponentProduct: any;
  productId: number;

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(res => {
      this.productId = parseInt(res.id);
      this.productService.getAllProduct().subscribe(res => {
        this.viewComponentProduct = res.filter(product => product.id == this.productId)[0];
      })
    });
  }

  deleteProduct(id) {
    this.productService.deleteProduct(id).subscribe(res => {
      console.log(res);
    })
  }

}
