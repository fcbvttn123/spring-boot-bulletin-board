import { Component } from '@angular/core';
import { Post } from '../../post';
import { PostService } from '../../post.service';

@Component({
  selector: 'app-post-list',
  standalone: true,
  imports: [],
  templateUrl: './post-list.component.html',
  styleUrl: './post-list.component.css',
})
export class PostListComponent {
  constructor(private postService: PostService) {}
  posts: Post[] = [];
}
