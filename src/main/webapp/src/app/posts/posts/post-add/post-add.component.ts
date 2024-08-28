import { Component } from '@angular/core';
import { PostService } from '../../post.service';
import { Post } from '../../post';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-post-add',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './post-add.component.html',
  styleUrl: './post-add.component.css',
})
export class PostAddComponent {
  constructor(private postService: PostService) {}
  post: Post = new Post();
  savePost(): void {
    // const currentDate = new Date();
    // this.post.dateCreated = currentDate;
    // this.post.timeCreated = currentDate;
    this.postService
      .createPost(this.post)
      .subscribe((data: Post) => this.postService.onPostAdded.emit(data));
  }
}
