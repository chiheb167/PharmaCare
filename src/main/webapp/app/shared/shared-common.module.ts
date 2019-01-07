import { NgModule } from '@angular/core';

import { PharmaCareSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [PharmaCareSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [PharmaCareSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class PharmaCareSharedCommonModule {}
