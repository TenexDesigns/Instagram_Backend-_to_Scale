Instagram was able to scale from 0 to 14 million users in just over a year with only 3 engineers by following three key principles and having a reliable tech stack. 

The principles were:
1. Keep things very simple.
2. Don’t re-invent the wheel.
3. Use proven, solid technologies when possible.

The tech stack they used included:

**Frontend**: Instagram initially launched as an iOS app in 2010. It was written using Objective-C and a combination of other things like UIKit.

**Load Balancing**: Instagram used Amazon’s Elastic Load Balancer. They had 3 NGINX instances that were swapped in and out depending on if they were healthy.

**Backend**: Instagram’s application server used Django and it was written in Python, with Gunicorn as their WSGI server. They used Fabric to run commands in parallel on many instances at once. This allowed them to deploy code in just seconds.

**Data Storage**: The application server would pull data from PostgreSQL, which stored most of Instagram’s data, such as users and photo metadata. The connections between Postgres and Django were pooled using Pgbouncer. Instagram sharded their data because of the volume they were receiving.

**Photo Storage**: Several terabytes of photos were stored in Amazon S3. These photos were served to users quickly using Amazon CloudFront.

**Caching**: Instagram used Redis to store a mapping of about 300 million photos to the user ID that created them. For general caching, Instagram used Memcached. They had 6 Memcached instances at the time.

**Push Notifications and Async Tasks**: This push notification was sent using pyapns. On the backend, the task is pushed into Gearman, a task queue which farmed out work to better-suited machines. Instagram had ~200 Python workers consuming the Gearman task queue.

**Monitoring**: Instagram used Sentry, an open-source Django app, to monitor Python errors in real-time. Munin was used to graph system-wide metrics and alert anomalies. Instagram had a bunch of custom Munin plugins to track application-level metrics, like photos posted per second. Pingdom was used for external service monitoring and PagerDuty was used for handling incidents and notifications.

By adhering to these principles and using this tech stack, Instagram was able to efficiently handle the rapid increase in users and data [Source 1](https://www.instagram.com/), [Source 2](https://instagram-engineering.com/what-powers-instagram-hundreds-of-instances-dozens-of-technologies-adf2e22da2ad).









....
