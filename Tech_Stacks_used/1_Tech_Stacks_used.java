Instagram scaled to 14 million users with only 3 engineers by following 3 key principles:

1. Keep things very simple.
2. Don’t re-invent the wheel.
3. Use proven and solid technologies when possible.

They also used a reliable tech stack, which included:

* **Frontend:** Objective-C and a combination of other things like UIKit.
* **Load Balancing:** Amazon’s Elastic Load Balancer.
* **Backend:** Django and Python, with Gunicorn as their WSGI server.
* **Database:** Postgres.
* **Photo Storage:** Amazon S3 and CloudFront.
* **Caching:** Redis and Memcached.
* **Push Notifications and Async Tasks:** pyapns and Gearman.
* **Monitoring:** Sentry and Munin.

Instagram's architecture was designed to be scalable and reliable. They used a master-replica setup for both Postgres and Redis, and they used Amazon EBS (Elastic Block Store) snapshotting to take frequent backups of the systems.

Instagram also used a number of techniques to improve performance, such as caching and sharding. They used Redis to cache frequently accessed data, and they sharded their Postgres database to improve scalability.

Overall, Instagram's success can be attributed to a combination of factors, including their simple and reliable tech stack, their focus on performance, and their commitment to using proven and solid technologies.






  
